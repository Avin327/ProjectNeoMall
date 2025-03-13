# NeoMall E-Commerce Website

NeoMall is a modern e-commerce platform that provides users with an intuitive and seamless shopping experience. It is built with a robust backend using **Spring Boot** and **.NET**, and an engaging frontend using **React**. The platform is designed for high performance, scalability, and user satisfaction.

## Features
- User authentication and authorization (Sign-up/Login)
- Product listing with search and filtering
- Shopping cart functionality
- Secure payment gateway integration
- Order history and tracking
- Admin panel for product, user, and order management
- RESTful APIs for seamless communication between frontend and backend

## Technologies Used

### Frontend
- **React**: For building a dynamic and interactive user interface
- **Tailwind CSS**: For responsive and modern UI design
- **Axios**: For making HTTP requests to backend APIs

### Backend
- **Spring Boot**: For business logic, API management, and backend services
- **.NET**: For additional backend services and API layers
- **Spring Security**: For secure authentication and role-based authorization
- **Entity Framework**: For database interaction in .NET
- **MySQL**: As the primary relational database
- **Hibernate**: For object-relational mapping in Spring Boot

## Installation

### Prerequisites
- Node.js (v14 or later)
- npm (v6 or later)
- Java 8 or later
- MySQL Server
- .NET Core SDK

### Setup Instructions

#### 1. Clone the Repository
```bash
git clone https://github.com/Avin327/ProjectNeoMall.git
```

#### 2. Set Up the Frontend
1. Navigate to the frontend directory:
   ```bash
   cd ProjectNeoMall/frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the React development server:
   ```bash
   npm start
   ```

#### 3. Set Up the Backend
##### Spring Boot
1. Navigate to the Spring Boot backend directory:
   ```bash
   cd ProjectNeoMall/spring-boot-backend
   ```
2. Configure the `application.properties` file with your MySQL credentials.
3. Build and run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

##### .NET
1. Navigate to the .NET backend directory:
   ```bash
   cd ProjectNeoMall/dotnet-backend
   ```
2. Update the configuration file (`appsettings.json`) with your database and other necessary settings.
3. Build and run the .NET application:
   ```bash
   dotnet run
   ```

## Usage
- Access the frontend at `http://localhost:3000`
- The backend APIs will be available at:
  - Spring Boot: `http://localhost:8080`
  - .NET: `http://localhost:5000`

## Contributing
We welcome contributions! Follow these steps:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Submit a pull request.

## License
This project is licensed under the MIT License.

## Contact
For any questions or feedback, please contact:
- **Name**: Avinash
- **Email**: [your-email@example.com]
