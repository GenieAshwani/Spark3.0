document.addEventListener('DOMContentLoaded', function() {
    const searchForm = document.getElementById('search-form');
    const resultsContainer = document.getElementById('results-container');
    const loadingElement = document.getElementById('loading');
    const errorMessage = document.getElementById('error-message');

    searchForm.addEventListener('submit', function(e) {
        e.preventDefault();
        
        // Get form values
        const sourceCode = document.getElementById('source').value.trim().toUpperCase();
        const destinationCode = document.getElementById('destination').value.trim().toUpperCase();
        
        // Validate inputs
        if (!sourceCode || !destinationCode) {
            alert('Please enter both source and destination station codes');
            return;
        }
        
        // Hide previous results and errors, show loading
        resultsContainer.classList.remove('active');
        errorMessage.style.display = 'none';
        loadingElement.style.display = 'block';
        
        // Fetch data from API
        fetch(`http://localhost:8080/search/by-code?sourceCode=${sourceCode}&destinationCode=${destinationCode}`)
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                // Hide loading spinner
                loadingElement.style.display = 'none';
                
                // Render results
                renderResults(data);
            })
            .catch(error => {
                console.error('Error fetching data:', error);
                loadingElement.style.display = 'none';
                errorMessage.style.display = 'block';
            });
    });
    
    function renderResults(trains) {
        // Clear previous results
        resultsContainer.innerHTML = '';
        
        // Show results container
        resultsContainer.classList.add('active');
        
        if (trains.length === 0) {
            resultsContainer.innerHTML = `
                <div class="no-results">
                    <h3>No trains found</h3>
                    <p>We couldn't find any trains matching your search criteria. Please try different station codes.</p>
                </div>
            `;
            return;
        }
        
        // Create result cards
        trains.forEach((train, index) => {
            const resultCard = document.createElement('div');
            resultCard.className = 'result-card';
            
            resultCard.innerHTML = `
                <div class="train-header">
                    <div class="train-name">${train.train.trainName}</div>
                    <div class="train-number">${train.train.trainNumber}</div>
                </div>
                <div class="journey-details">
                    <div class="station departure">
                        <div class="time">${train.departureTime}</div>
                        <div class="station-name">${train.source.stationName}</div>
                        <div class="station-code">${train.source.stationCode}</div>
                    </div>
                    <div class="connector">
                        <div class="line"></div>
                    </div>
                    <div class="station arrival">
                        <div class="time">${train.arrivalTime}</div>
                        <div class="station-name">${train.destination.stationName}</div>
                        <div class="station-code">${train.destination.stationCode}</div>
                    </div>
                </div>
                <div class="book-button">
                    <button class="book-btn">Book Now</button>
                </div>
            `;
            
            resultsContainer.appendChild(resultCard);
            
            // Animate card entrance
            setTimeout(() => {
                resultCard.classList.add('visible');
            }, 100 * index);
        });
        
        // Add event listeners to book buttons
        document.querySelectorAll('.book-btn').forEach(button => {
            button.addEventListener('click', function() {
                alert('Booking functionality would be implemented here!');
            });
        });
    }
    
    // Populate with example data for testing if needed
    // Uncomment the following lines to test without API
    /*
    const testData = [
        {
            "id": 1,
            "train": {
                "id": 1,
                "trainName": "Rajdhani Express",
                "trainNumber": "12306"
            },
            "source": {
                "id": 1,
                "stationName": "New Delhi",
                "stationCode": "NDLS"
            },
            "destination": {
                "id": 2,
                "stationName": "Mumbai Central",
                "stationCode": "CST"
            },
            "departureTime": "06:00",
            "arrivalTime": "14:00"
        }
    ];
    renderResults(testData);
    */
});