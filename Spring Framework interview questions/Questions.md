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

