
# 🛒 ShoppingCartSystem - Spring Boot Project

This is a full-stack backend application developed using **Spring Boot** and **MySQL**. It demonstrates a RESTful API implementation for managing a simple shopping cart system, including users, products, and cart items.

## 🚀 Technologies Used

- Java 17
- Spring Boot 3.5.3
- Spring Data JPA
- MySQL
- RESTful APIs
- Postman (for API testing)
- Maven

## 📁 Project Structure

```
ShoppingCartSystem
├── controller
│   ├── CartController.java
│   ├── ProductController.java
│   └── UserController.java
├── model
│   ├── Cart.java
│   ├── CartItem.java
│   ├── Product.java
│   └── User.java
├── repository
│   ├── CartItemRepository.java
│   ├── CartRepository.java
│   ├── ProductRepository.java
│   └── UserRepository.java
├── service
│   ├── CartService.java
│   ├── ProductService.java
│   └── UserService.java
└── service/impl
    ├── CartServiceImpl.java
    ├── ProductServiceImpl.java
    └── UserServiceImpl.java
```

## 🔄 API Endpoints

### 👤 User Endpoints

- **POST** `/api/users/create` — Add a new user  
- **GET** `/api/users` — Get all users  
- **PUT** `/api/users/update/{id}` — Update user by ID  
- **DELETE** `/api/users/delete/{id}` — Delete user by ID  

## 📬 Sample Postman Request

**POST** `/api/users/create`

```json
{
  "name": "Sejal",
  "email": "sejal@example.com",
  "password": "sejal123",
  "address": "Nagpur",
  "contactNo": "9876543210"
}
```

**✅ Sample Response (Status: 200 OK):**

```json
{
  "id": 1,
  "name": "Sejal",
  "email": "sejal@example.com",
  "password": "sejal123",
  "address": "Nagpur",
  "contactNo": "9876543210",
  "cart": null
}
```

## 🛢️ Sample MySQL Output

| id | name  | email             | password | address | contact_no  |
|----|-------|-------------------|----------|---------|-------------|
|  1 | Sejal | sejal@example.com | sejal123 | Nagpur  | 9876543210  |

## 📌 How to Run

1. Clone the repository  
2. Set up MySQL and create a database  
3. Update `application.properties` with your MySQL credentials  
4. Run the Spring Boot application  
5. Test APIs using Postman at `http://localhost:8080`

## 👩‍💻 Author

**Sejal Karwa** — [GitHub](https://github.com/Sejalkarwa)

## 📝 License

This project is open-source and available under the [MIT License](LICENSE).
