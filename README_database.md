# Artisan Connect – Database

This folder contains the schema and seed data for the database used in the **Artisan Connect** project.

## Tables Created

- `users`: Stores users of the system (artisans and customers)
- `products`: Products added by artisans
- `categories`: Types of products
- `product_categories`: Many-to-many association between products and categories

## Technology Stack

- Database: **MySQL**
- Hosted on: [Railway](https://railway.app)
- Management interface: Railway Web Console

## Connection Details (for Spring Boot backend)

```
Host: switchback.proxy.rlwy.net
Port: 42899
User: root
Database: railway
Password: (check Railway dashboard)
```

## Next Steps

- Connect to Spring Boot backend (lead: Rosymar)
- Implement relationships in backend code
- Populate database with real content as the frontend evolves

---
