# SpiceJet-Flight-Booking-System

This Repository is a part of Certification project.

Title: Automated Testing of the SpiceJet Flight Booking System

Test objective: The goal of this project is to build a system that can automatically test the functionality of the SpiceJet flight booking system (https://www.spicejet.com/). The system will use Selenium, a tool for automating web browsers, to navigate through the website and perform various actions, such as searching for flights and booking tickets. The system will then verify that the flight booking system is functioning correctly by checking the resulting web pages for expected content and behavior.

Precondition: The user has logged in to the ticket booking application and has access to the booking feature.

Test cases should  contain all Positive and Negative scenarios.

Demo URL: You can use the following URL for testing : "https://www.spicejet.com/" 

Task description:
Set up a Selenium project in your preferred programming language (Java, Python, etc.).
Write code to open a web browser and navigate to the SpiceJet flight booking system (https://www.spicejet.com/).
Validate the Sign-Up Page by filling out Mandatory and Non-Mandatory Fields.
Write a code to Login with dummy email ID and Password on Popup fields after clicking Login button on top of the page.
Write code to search for flights by entering dummy origin and destination information for below types of trips:
a) One-way
b) Round Trip
Write code to select a flight and proceed to the booking page.
Write code to fill out the booking form with dummy passenger and payment information.
Write code to verify that the booking was successful by checking the resulting web page for the booking confirmation message.
Write a code to validate below fields available on booking page
a) Check-in
b) Flight status
c) Manage Booking
Write code to close the web browser when testing is complete.
Write code to run the test suite automatically on a regular basis.
Notes:
This project should be able to handle any errors that may occur during the booking process (such as an invalid flight or payment information), and should be able to successfully book a ticket when all of the required information is provided correctly.

The project should cover Selenium workflows like Action Classes, Window Handles , Frames,Alerts and Dynamic Xpath handling.

The Project should handle Cross Browser Testing(Same Scripts works for all browsers like ( Chrome and Firefox).

Expected Result:
The system should be able to successfully complete an end-to-end test of the SpiceJet flight booking system, including searching for and booking a flight. The system should also be able to verify that the booking was successful by checking the resulting web page for the booking confirmation message.

Any Basic hints to solve? 
Determine the web browser that you want to use for testing (e.g. Chrome, Firefox, Safari).
Set up your test environment by launching the browser.
Make sure you have the necessary software installed on your computer. This typically includes a Java Development Kit (JDK) and a build automation tool such as Apache Maven.
Define the project's dependencies in the pom.xml file. These are external libraries or frameworks that your project needs in order to build and run.
Choose a reporting library or tool that is compatible with Selenium and Java. Some popular options include Extent-Reports, Cucumber Reports and TestNG.
Run your test cases and generate the test reports. This will involve executing the test cases and using the reporting library or tool to create the reports based on the test results.
Review the test reports to analyze the results and identify any issues or defects.
Write code to take screenshots of the SpiceJet flight booking system during testing to help debug any issues that arise.
