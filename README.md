RESTful API with Spring - User Management
This is a simple RESTful API built with Spring framework that allows managing user data. Users can be created, retrieved, updated and deleted using HTTP requests.

API endpoints
The following endpoints are available for managing user data:

Create User
POST /Users/createUser: Create a new user
The user data should be sent in the request body in JSON format.

Get All Users
GET /Users/AllUsers: Retrieve all users
Returns a list of all the users stored in the database.

Update User
PUT /Users/updateUser/{id}: Update an existing user
Updates the user with the specified ID. The new user data should be sent in the request body in JSON format.

Delete User
DELETE /Users/deleteUser/{id}: Delete an existing user
Deletes the user with the specified ID.

Running the application
To run the application, you need to have Java and Maven installed on your system. Then, follow these steps:

Clone the repository

Open a terminal window and navigate to the project root directory

Run the command mvn spring-boot:run

The application should start and be accessible at http://localhost:8080

Conclusion
This is a simple example of a RESTful API built with Spring framework that allows managing user data. The endpoints provided can be used to create, retrieve, update and delete user data. You can build upon this example to create more complex APIs for your own use cases.
