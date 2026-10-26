# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.alexneri.example.spring.inject-bean-by-name' is invalid and this project uses 'com.alexneri.example.spring.inject_bean_by_name' instead.

# Getting Started

### Reference Documentation
Spring - Resolving ambiguity by using @Qualifier

Specifying an unique name for @Bean annotation is necessary if

    1. the configuration provides more than one implementations for a bean
    2. or if we want to inject bean instances by name rather than by type.

To match a named bean to an injection point (or in other words to qualify a bean to an injection point), the bean's property name (at the injection point) should match with the bean definition name.
