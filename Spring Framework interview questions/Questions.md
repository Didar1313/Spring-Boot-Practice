# 🌱 Spring Framework – Interview Q\&A 

This document covers key Spring Framework interview questions and answers, rewritten in a clear and beginner-friendly style. Each answer includes explanations and examples so it's easier to understand and remember.

---

### ✅ Q1: What Is the Spring Framework?

**Answer:**

Spring is one of the most widely used frameworks for building Java applications, especially enterprise-level solutions. While it’s commonly used with Java EE (now Jakarta EE), Spring can also be used for building simple Java applications.

At its core, Spring provides powerful features like Dependency Injection (DI) and Inversion of Control (IoC), which help manage how objects are created and interact with each other.

You can also build full-fledged web applications using Spring modules like Spring MVC, Spring Boot, and Spring Data.

---

### ✅ Q2: What Are the Benefits of Using Spring?

**Answer:**

Spring makes Java development faster, cleaner, and more manageable. Here's why developers love using it:

* **Lightweight:** Spring doesn’t add much overhead — it’s fast and flexible.
* **Inversion of Control (IoC):** Spring manages your object dependencies so you don’t have to create or wire them manually.
* **Aspect-Oriented Programming (AOP):** Helps separate cross-cutting concerns (like logging, security, transactions) from core business logic.
* **IoC Container:** Handles bean lifecycle, configuration, and dependency management.
* **Spring MVC:** A clean way to build web applications and RESTful services, returning JSON or XML responses easily.
* **Transaction Management:** Simplifies database operations and file uploads with less boilerplate code.
* **Exception Handling:** Converts technology-specific exceptions into cleaner, unchecked exceptions.

---

### ✅ Q3: What Are the Key Spring Modules (Sub-Projects)?

**Answer:**

Spring is a collection of modules, each focused on a specific task. Here are the most important ones:

* **Core:** The heart of the Spring Framework. Provides DI and IoC.
* **Spring JDBC:** Simplifies JDBC code by handling boilerplate tasks.
* **Spring ORM:** Integrates with Hibernate, JPA, JDO, etc., to manage database entities.
* **Spring Web:** Adds web-specific features like file uploads and servlet listeners.
* **Spring MVC:** Implements the MVC pattern for building web apps and APIs.
* **Spring AOP:** Supports aspect-oriented programming for separating concerns.

---

### ✅ Q4: What Is Dependency Injection (DI)?

**Answer:**

Dependency Injection is a design pattern where objects are provided with their dependencies instead of creating them manually.

In Spring, you define how your objects (beans) relate to one another, and Spring takes care of creating and connecting them.

**Example:**

Instead of writing:

```java
Car car = new Car(new Engine());
```

Spring will inject `Engine` into `Car` automatically when you need it.

---

### ✅ Q5: How Can You Inject Beans in Spring?

**Answer:**

Spring supports three types of dependency injection:

* **Constructor Injection** – Dependencies are passed via the class constructor.
* **Setter Injection** – Dependencies are set using setter methods.
* **Field Injection** – Dependencies are injected directly into fields using annotations like `@Autowired`.

You can configure DI using:

* XML configuration
* Java annotations (e.g., `@Component`, `@Autowired`)
* Java-based configuration using `@Configuration` and `@Bean`

---

### ✅ Q6: What Is the Best Way to Inject Beans?

**Answer:**

**Constructor injection** is generally the best choice for required dependencies because:

* It makes fields **immutable**
* Makes unit testing easier
* Ensures required dependencies are not missed

Use **setter injection** only for optional dependencies.

---

### ✅ Q7: Difference Between BeanFactory and ApplicationContext?

**Answer:**

Both are interfaces used to manage Spring beans, but they differ in capability:

| Feature        | BeanFactory      | ApplicationContext                                           |
| -------------- | ---------------- | ------------------------------------------------------------ |
| Bean loading   | Lazy (on demand) | Eager (at startup)                                           |
| Extra features | No               | Yes – includes internationalization, event propagation, etc. |
| Use case       | Lightweight apps | Full-featured enterprise apps                                |

**Conclusion:** `ApplicationContext` is a more advanced and preferred container in most applications.

---

### ✅ Q8: What Is a Spring Bean?

**Answer:**

A Spring Bean is simply a **Java object** that is **created, managed, and configured** by the Spring IoC container.

Beans are usually defined using annotations like `@Component`, `@Service`, `@Repository`, or in XML configuration.

---

### ✅ Q9: What Is the Default Bean Scope in Spring?

**Answer:**

By default, every Spring Bean is a **singleton**, meaning only **one instance** is created and shared across the application context.

---

### ✅ Q10: How to Define the Scope of a Bean?

**Answer:**

You can define a bean’s scope using:

* `@Scope("scopeName")` annotation
* `scope` attribute in XML

Supported scopes include:

* **Singleton (default):** One shared instance per Spring container
* **Prototype:** New instance every time it’s requested
* **Request:** One instance per HTTP request (for web apps)
* **Session:** One instance per HTTP session
* **Global-session:** Used in portlet-based applications

---

### ✅ Q11: Are Singleton Beans Thread-Safe?

**Answer:**

**No**, singleton beans are **not thread-safe** by default. Singleton refers to the **object creation pattern**, not how it's used in multi-threaded environments.

Thread safety depends entirely on how you design your bean's internal code.

---

### ✅ Q12: What Is the Spring Bean Life Cycle?

**Answer:**

A Spring bean goes through the following life cycle stages:

1. **Instantiation:** Spring creates an instance of the bean.
2. **Dependency Injection:** Spring injects the required dependencies.
3. **Initialization:** Any custom initialization logic runs (e.g., methods annotated with `@PostConstruct`).
4. **Usage:** The bean is ready to be used in the app.
5. **Destruction:** When no longer needed, Spring calls destroy methods (e.g., annotated with `@PreDestroy`).

---

## ☘️ Spring Core 

---

### ❓ 13. What is Spring Java-Based Configuration?

🔧 Instead of writing XML files, you can use Java classes to configure Spring beans.

✅ **Why it's better:**

* Easy to read and maintain
* Auto-complete and error checking in IDE
* Less chance of typos than XML

📝 You use `@Configuration` to declare a config class, and `@Bean` to define beans.

---

### 📁 14. Can We Have Multiple Spring Configuration Files?

✅ Yes! You can split configurations into multiple files for better organization (like `DatabaseConfig`, `SecurityConfig`, etc.).

🧩 Combine them using:

* `@Import` (Java config)
* `<import>` (XML config)

---

### 🔐 15. What is Spring Security?

Spring Security is a powerful tool to **protect** your web applications.

🔒 It handles:

* Login & Logout
* Password encryption
* Role-based access
* CSRF protection

💡 It works by **filtering requests** and checking user roles and permissions.

---

### 🚀 16. What is Spring Boot?

Spring Boot helps you **start a Spring project faster** with:

* Auto configurations
* Built-in servers (like Tomcat)
* No XML files required

🏁 Just run your `main()` method and your app is up!

---

### 🧠 17. Common Design Patterns in Spring

| 🧩 Pattern Name      | 📌 Usage in Spring              |
| -------------------- | ------------------------------- |
| 🔁 Singleton         | Default bean scope              |
| 🏭 Factory           | BeanFactory, ApplicationContext |
| 👥 Proxy             | AOP, Security                   |
| 📜 Template Method   | JdbcTemplate, RestTemplate      |
| 🖼️ MVC              | Spring MVC Architecture         |
| 🛎️ Front Controller | DispatcherServlet               |
| 📦 DAO               | Data Access Layer               |
| 🧲 Observer          | Event handling                  |

---

### 🍃 18. How Does Prototype Scope Work?

🔁 Normally Spring creates **one bean instance** (singleton).

🆕 With `prototype` scope, a **new object is created each time** you ask for the bean.

📦 Useful when you don’t want to share the same object.

---

## 🌐 Spring MVC (Web Layer)

---

### 🌍 19. How to Access ServletContext and ServletConfig?

Spring gives you access to web-specific objects like:

* 🌐 `ServletContext` → Global app settings
* ⚙️ `ServletConfig` → Settings for specific servlets

✅ You can use `@Autowired` or implement special interfaces to access them.

---

### 🎮 20. What is a Controller?

A `@Controller` is a class that handles **web requests** (like buttons clicked on a website).

🧭 It takes input, processes it, and returns a view (HTML or data).

Example: When someone visits `/login`, a controller method decides what to do.

---

### 🧭 21. What is @RequestMapping?

🔗 It connects a **URL** to a **method** in a controller.

🗺️ For example, when someone goes to `/products`, the method with `@RequestMapping("/products")` will be called.

✨ There are shortcuts too:

* `@GetMapping` (for GET requests)
* `@PostMapping` (for POST requests)

---

## 💾 Spring Data Access

---

### 🛠️ 22. What is JdbcTemplate?

JdbcTemplate helps you work with databases **easily**.

✅ It:

* Connects to DB
* Executes queries
* Handles exceptions

📉 You don’t have to write long and messy JDBC code.

---

### 🔄 23. How to Enable Transactions?

Transactions help **keep data safe** during operations like insert, update, delete.

💡 Use `@Transactional` on methods:

* If something fails, changes are rolled back.
* Ensures data consistency.

---

### 🗃️ 24. What is Spring DAO?

DAO = **Data Access Object**

🎯 It's a design pattern used to **separate DB code** from business logic.

Spring provides tools like `JdbcTemplate` or `JpaRepository` to make this easy.

---

## 🌀 Spring AOP (Aspect Oriented Programming)

---

### 💡 25. What is AOP?

AOP = Aspect Oriented Programming

🔍 Helps you add **common features** like:

* Logging
* Security
* Transactions

📦 Without touching your actual business logic.

---

### 🧩 26. AOP Concepts Made Simple

| 🧠 Term      | 📘 Meaning                                  |
| ------------ | ------------------------------------------- |
| ⭐ Aspect     | The cross-cutting code (e.g., logging)      |
| 🎯 Advice    | What should run (e.g., before/after method) |
| ⏱️ JoinPoint | The place where code is inserted            |
| 📌 Pointcut  | Rule to select JoinPoints                   |

🛠️ You define these in classes using annotations like `@Aspect`, `@Before`, etc.

---

### 🪡 27. What is Weaving in AOP?

🧵 Weaving = Connecting aspects with actual code.

🕐 In Spring, weaving happens at **runtime** using **proxies** (no need for special compilers).

---

## 🌊 Spring 5 & Reactive Programming

---

### ⚡ 28. What is Reactive Programming?

It’s a modern way to build apps that are:

* 🚀 Fast
* 🧠 Asynchronous
* 🌐 Non-blocking

💥 Instead of waiting for things (like database or API), your app reacts when data is ready.

📦 Uses:

* `Mono<T>` → 0 or 1 item
* `Flux<T>` → 0 to many items

✅ Great for apps that need to handle **lots of users at once**.

---



