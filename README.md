# 🏧 ATM Application

A Java-based ATM simulation application that replicates core banking operations including account login, balance inquiry, cash withdrawal, deposit, and transaction history — built using OOP principles and Java console I/O.

---

## 📌 About the Project

This application simulates the functionality of a real ATM machine. Users can authenticate with their account credentials and perform standard banking transactions through a clean, menu-driven console interface. The project demonstrates strong Object-Oriented Programming design and real-world business logic implementation in Java.

---

## ✨ Features

- 🔐 Secure PIN-based authentication (account number + PIN)
- 💰 Check account balance
- 💸 Cash withdrawal with balance validation
- 🏦 Deposit funds into account
- 📜 View transaction history
- 🔄 Multiple transactions per session
- ❌ Account lockout after failed PIN attempts
- 🚪 Secure logout

---

## 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| Java | Core programming language |
| OOP | Encapsulation, Inheritance, Abstraction |
| Java Collections | Transaction history management |
| Scanner | Console input handling |
| Exception Handling | Invalid input and error management |

---

## 📁 Project Structure

```
ATM-Application/
│
├── ATMApplication/
│   ├── src/
│   │   ├── Main.java              # Entry point
│   │   ├── ATM.java               # Core ATM operations
│   │   ├── Account.java           # Account model class
│   │   ├── Transaction.java       # Transaction model
│   │   └── AuthService.java       # PIN authentication logic
│
└── README.md
```

---

## ⚙️ How to Run

### Prerequisites
- Java JDK 8 or above
- Any IDE (Eclipse / IntelliJ / VS Code) or terminal

### Steps

```bash
# Clone the repository
git clone https://github.com/Gethe-Anuradha/ATM-Application.git
cd ATM-Application/ATMApplication

# Compile
javac src/*.java

# Run
java src.Main
```

---

## 🖥️ Sample Output

```
===== Welcome to ATM =====
Enter Account Number: 123456
Enter PIN: ****
Authentication Successful!

===== ATM Menu =====
1. Check Balance
2. Withdraw Cash
3. Deposit Cash
4. Transaction History
5. Logout

Enter choice: 1
Your current balance: ₹15,000.00

Enter choice: 2
Enter withdrawal amount: ₹5000
Transaction Successful! Remaining balance: ₹10,000.00
```

---

## 🎯 Key Concepts Applied

- **Object-Oriented Programming** — Encapsulation, Inheritance, and Abstraction across Account, ATM, and Transaction classes
- **Authentication Logic** — PIN validation with lockout mechanism
- **Exception Handling** — Graceful error management for invalid inputs and insufficient balance
- **Java Collections** — ArrayList for maintaining transaction history per session
- **Business Logic** — Real-world banking rules (balance checks, withdrawal limits)
- **SDLC Practices** — End-to-end development from design to testing and documentation

---

## 👩‍💻 Developer

**Anuradha Gethe**
- 🔗 [LinkedIn](https://www.linkedin.com/in/anuradha-gethe-a27232213)
- 🐙 [GitHub](https://github.com/Gethe-Anuradha)
- 📧 anuradhagethe845@gmail.com
