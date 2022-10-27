CREATE TABLE `kiurest`.`student`(
    `stud_id` INT NOT NULL AUTO_INCREMENT ,
    `f_name` VARCHAR(30) NOT NULL ,
    `l_name` VARCHAR(40) NOT NULL ,
    `date_of_birth` DATE NOT NULL ,
    `school_id` INT NOT NULL ,
    PRIMARY KEY (`stud_id`),
    INDEX (`school_id`)
) ENGINE = InnoDB;

CREATE TABLE `kiurest`.`school` (
    `school_id` INT NOT NULL AUTO_INCREMENT ,
    `name` VARCHAR(50) NOT NULL ,
    PRIMARY KEY (`school_id`)
) ENGINE = InnoDB;

CREATE TABLE `kiurest`.`course` (
    `course_id` INT NOT NULL AUTO_INCREMENT ,
    `course_name` VARCHAR(50) NOT NULL ,
    `school_id` INT NOT NULL,
    `professor_id` INT NOT NULL ,
    PRIMARY KEY (`course_id`),
    INDEX (`school_id`),
    INDEX (`professor_id`)
) ENGINE = InnoDB;

CREATE TABLE `kiurest`.`professor` (
    `professor_id` INT NOT NULL AUTO_INCREMENT ,
    `f_name` VARCHAR(30) NOT NULL ,
    `l_name` VARCHAR(40) NOT NULL ,
    `date_of_birth` DATE NOT NULL ,
    PRIMARY KEY (`professor_id`)
) ENGINE = InnoDB;