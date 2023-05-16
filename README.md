# Assessment-

# Simple File-Based Database

This is a simple file-based database implemented in Java. It allows you to create tables and insert data into those tables using SQL-like commands. The database stores table metadata in a separate file and stores table data in text files.

## Getting Started

To run the program, you'll need to have Java installed on your system. Follow these steps:

1. Clone or download the repository to your local machine.
2. Compile the Java source code by running the following command in the terminal:

`javac SimpleDatabase.java`

3. Run the program with the following command:
`java SimpleDatabase`



## Usage

Once the program is running, you can enter commands in the following format:

- **Create Table**: To create a table, use the `create table` command followed by the table name and column definitions. For example:

create table <table_name> <col1_type> <col2_type> ...

Valid column types are `integer` and `string`.

- **Insert Data**: To insert data into a table, use the `insert` command followed by the table name and the values to be inserted. For example:

insert into <table_name> values (<value1>, <value2>, ...)
  
- **Exit**: To exit the program, type `exit` or press `Ctrl + C`.

## Example

Here's an example session using the file-based database:

Welcome to Simple Database!

Enter a command: create table employees integer string

Table created successfully!

Enter a command: insert into employees values (1, 'John Doe')

Data inserted successfully!

Enter a command: insert into employees values (2, 'Jane Smith')

Data inserted successfully!

Enter a command: exit

Goodbye!
  
In this example, a table named `employees` with two columns (`integer` and `string`) is created. Two rows of data are then inserted into the `employees` table.

## Limitations

Please note that this is a simplified example and doesn't include advanced database features, data retrieval, or error handling. It's meant to demonstrate the basic concept of a file-based database using Java.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

  
  






