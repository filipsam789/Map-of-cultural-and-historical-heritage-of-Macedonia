![FINKI UKIM Logo](http://ilt.finki.ukim.mk/wp-content/uploads/2016/10/Logo_FINKI_UKIM_EN.jpg)

# Project for Software Design and Architecture

**Topic: Map of cultural and historical heritage of Macedonia**

**Subject**: Software Design and Architecture

**Authors**:
- Filip Samardzhiski (211097)
- Tamara Stojanova (211079)
- Viktor Vasilev (211504)
- Martin Patchev (211524)
- Blagoja Ovezoski (211521)

This project involves developing a mapping application focused on objects of cultural and historical heritage in Macedonia, completed through four incremental steps (homeworks).

The first step involved creating the software requirements, project description, and initial pipe-and-filter architectural style. Data was extracted from OpenStreetMap, filtered using our defined criteria, and loaded into a database. Next, we created diagrams for our conceptual, execution, and implementation architectures, detailing the components for each. In the implementation architecture, we decided to use Java Spring Boot for the backend and React.js for the frontend.

We then designed mockups in Figma, leading to a technical prototype that was a semi-functional React application. Following this, we implemented all the requirements defined in the first step, resulting in a complete backend and frontend.

One of the final steps was refactoring, which involved using design patterns and writing more optimized, loosely coupled code to enhance reusability and maintainability. As part of this, we separated the monolithic backend into two microservices. The final step was to dockerize the backend microservices and the frontend, orchestrate everything, and deploy the application using Azure.

Due to the high deployment costs, we had to stop hosting our app. However, a demo video is available in the repository.
