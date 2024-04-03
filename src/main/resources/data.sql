INSERT INTO class_details (class_id, class_strength) VALUES
                                                         (1, 25),
                                                         (2, 30),
                                                         (3, 20);

insert into student (student_id, student_name, student_class, parent_email) VALUES
                                                                (7,'Akhil',1,'parent1@gmail.com'),
                                                                (2,'Teja',2,'parent2@gmail.com'),
                                                                (3,'Arun',3,'parent3@gmail.com'),
                                                                (4,'sai',2,'parent4@gmail.com'),
                                                                 (5,'pa',1,'parent5@gmail.com');

insert into principal(principal_name,principal_age)VALUES ('Ramarao',50);


INSERT INTO Attendance (student_id, student_class, status, date) VALUES
                                                                     (7, 1, 'Present', '2024-03-26'),
                                                                     (2, 2, 'Absent', '2024-03-26'),
                                                                     (3, 3, 'Present', '2024-03-26'),
                                                                     (4, 2, 'Absent', '2024-03-26'),
                                                                     (5, 1, 'Present', '2024-03-26');


-- Insert sample data for parents
INSERT INTO login_details (username,email, password)
VALUES
    (parent1,'parent1@gmail.com', 'password1'),
    (parent2,'parent2@gmail.com', 'password2'),
    (parent3,'parent3@gmail.com', 'password3'),
    (parent4,'parent4@gmail.com', 'password4'),
    (parent5,'parent5@gmail.com', 'password5'),
    (principal,'principal@gmail.com', 'principal_password');