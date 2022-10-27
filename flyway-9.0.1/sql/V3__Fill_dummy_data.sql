INSERT INTO `kiurest`.`professor` (`professor_id`, `f_name`, `l_name`, `date_of_birth`)
VALUES (NULL, 'John', 'Doe', '1978-11-29'),
       (NULL, 'Jane', 'Doe', '1987-07-22'),
       (NULL, 'Jake', 'Doe', '1998-11-12');

INSERT INTO `kiurest`.`school` (`school_id`, `name`)
VALUES (NULL, 'CS'),
       (NULL, 'MGMT');

INSERT INTO `kiurest`.`student` (`stud_id`, `f_name`, `l_name`, `date_of_birth`, `school_id`)
VALUES (NULL, 'Jensen', 'Ackles', '2003-07-22', '1'),
       (NULL, 'Winona', 'Ryder', '2003-11-13', '1'),
       (NULL, 'Drake', 'Ramoray', '2002-01-04', '2');

INSERT INTO `kiurest`.`course` (`course_id`, `course_name`, `school_id`, `professor_id`)
VALUES (NULL, 'Java', '1', '1'),
       (NULL, 'Databases', '1', '2'),
       (NULL, 'Entrepreneurship', '2', '3');

INSERT INTO `kiurest`.`student_to_course` (`stud_id`, `course_id`)
VALUES ('1', '1'),
       ('1', '2'),
       ('2', '1'),
       ('2', '2'),
       ('3', '3');