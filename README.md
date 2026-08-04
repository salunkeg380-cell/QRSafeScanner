QRSafeScanner – QR Code Phishing Detection System
* Project Overview

QRSafeScanner is a Java-based cybersecurity application that scans QR code images, extracts the embedded URL, and analyzes it using rule-based security checks to detect potential phishing websites. The application also stores scan history for future reference.

* Problem Statement

Traditional email security systems often fail to detect phishing attacks delivered through QR codes because QR codes hide URLs inside images.

This project helps users identify suspicious QR codes before opening malicious websites.

* Features
Decode QR codes from images
Extract embedded URLs
Detect suspicious or phishing URLs
Rule-based URL analysis
Maintain scan history
Exception handling for invalid images
Console-based user interface

* Technologies Used
Technology	Purpose
Java	Core application
ZXing	QR code decoding
File Handling	Store scan history
OOP	Project architecture
Git & GitHub	Version control

* Project Structure
QRSafeScanner
│
├── src/
│   ├── Main.java
│   ├── QRDecoder.java
│   ├── URLAnalyzer.java
│   ├── ScanHistory.java
│   └── Utils.java
│
├── lib/
│   ├── core-3.5.3.jar
│   └── javase-3.5.3.jar
│
├── images/
│   ├── safe.png
│   └── phishing.png
│
├── History/
│   └── history.txt
│
└── README.md

* How It Works
User enters the QR code image path.
ZXing decodes the QR code.
The URL is extracted.
Rule-based checks analyze the URL.
The application classifies it as:
SAFE
PHISHING
The result is stored in the scan history.

* System  Architecture
  <img width="946" height="632" alt="image" src="https://github.com/user-attachments/assets/132ef536-347c-428f-9a8e-48cec14c2b3e" />



* How to Run
Compile
javac -cp "lib/*" src/*.java
Run
java -cp "lib/*;src" Main

  * Sample Output
   Image provide-
<img width="490" height="283" alt="image" src="https://github.com/user-attachments/assets/09305248-f93e-44d5-a41e-375f9f2ba7de" />



* Phishing Detection Rules

The application marks a URL as suspicious if it contains:

IP addresses instead of domain names
Suspicious keywords (login, verify, update, free, bank, secure)
Unusually long URLs
Suspicious domain patterns

* Challenges Faced
Reading QR codes from different image formats
Handling invalid or corrupted QR images
Integrating the ZXing library
Designing effective rule-based phishing detection

* Future Enhancements
GUI using Java Swing or JavaFX
Machine Learning-based phishing detection
Website reputation checking
VirusTotal API integration
Real-time webcam QR scanning
PDF report generation

* Author

Geeta Jalindar Salunke

Bachelor of Engineering (Information Technology)

* License
This project is developed for educational purposes.For learning how the java works with library.
