CREATE TABLE IF NOT EXISTS class_details(
    class_id       INT PRIMARY KEY,
    class_strength INT
);

create table if not exists student(
    student_id INT PRIMARY KEY,
    student_name varchar(255),
    student_class INT,
    parent_email varchar(255),
    FOREIGN KEY (student_class) REFERENCES class_details(class_id)
);


create table if not exists principal(
    principal_name varchar(255),
    principal_age INT
);
create table if not exists attendance(
    student_id INT PRIMARY KEY,
    student_class INT,
    status VARCHAR(20),
    date DATE,
    FOREIGN KEY (student_id) REFERENCES Student(student_id) ON DELETE CASCADE
);

CREATE TABLE login_details (
                               id INT AUTO_INCREMENT PRIMARY KEY,
                               username VARCHAR(255) NOT NULL,
                               email VARCHAR(255) NOT NULL UNIQUE,
                               password VARCHAR(255) NOT NULL
                               //is_principal BOOLEAN NOT NULL
);
