# Email Administration App

The **Email Administration App** is a lightweight Java application designed to manage employee email accounts efficiently. This app automates the generation of email addresses, secure passwords, and department assignments, making it ideal for organizations of any size.

## Features
- **Automated Email Address Generation**: Combines employee first name, last name, and department to create unique email IDs.
- **Random Password Generator**: Creates secure passwords of configurable length.
- **Department Assignment**: Employees can be categorized into Sales, Development, Accounting, or "None."
- **Mailbox Management**: Supports customizable mailbox capacity settings.
- **Account Recovery Options**: Alternate email functionality for easy recovery.
- **Information Display**: Provides an overview of user details and email settings.

## How It Works
1. Enter the employee's first and last name.
2. Select the department code:
   - `1`: Sales
   - `2`: Development
   - `3`: Accounting
   - `0`: None
3. The app generates:
   - A unique email ID.
   - A secure random password.
4. Optionally configure mailbox capacity and set an alternate email.

## Example
```text
Email Created: John Doe
Department code-
1. Sales
2. Development
3. Accounting
0. None
Enter the department: 2
The Department is: Development
Password: XJQAWRLPOZ
Your email: john.doe@development.github.com
