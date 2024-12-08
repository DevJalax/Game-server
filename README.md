# Game server [an attempt to replicate COD] 

I) Config :

WebSocketConfig configures WebSocket endpoints for real-time communication between players


II) Entity : 

Game and Player are JPA entities stored in a database

Replay is a JPA entity representing a recorded game session

PlayerMetrics is a JPA entity storing aggregated player stats


III) Repository :

GameRepository is a Spring Data JPA repository for querying game data

ReplayRepository is a Spring Data JPA repository for querying replays

MetricsRepository is a Spring Data JPA repository for querying metrics



IV) Controller :

GameController handles HTTP requests and WebSocket messages

ReplayController exposes REST endpoints for managing replays

MetricsController exposes REST endpoints for querying player metrics


other services : 

map service (handle each player location(coordinates))

respawn service (as many times respawn at random location within time gets over)
