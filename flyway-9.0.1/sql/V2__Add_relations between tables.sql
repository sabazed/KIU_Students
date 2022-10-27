CREATE TABLE `kiurest`.`student_to_course` (
    `stud_id` INT NOT NULL ,
    `course_id` INT NOT NULL ,
    PRIMARY KEY (`stud_id`, `course_id`)
) ENGINE = InnoDB;

ALTER TABLE `kiurest`.`student_to_course`
    ADD FOREIGN KEY (`stud_id`)
    REFERENCES `kiurest`.`student`(`stud_id`)
    ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `kiurest`.`student_to_course`
    ADD FOREIGN KEY (`course_id`)
    REFERENCES `kiurest`.`course`(`course_id`)
    ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `kiurest`.`student`
    ADD FOREIGN KEY (`school_id`)
    REFERENCES `kiurest`.`school`(`school_id`)
    ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `kiurest`.`course`
    ADD FOREIGN KEY (`school_id`)
    REFERENCES `kiurest`.`school`(`school_id`)
    ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE `kiurest`.`course`
    ADD FOREIGN KEY (`professor_id`)
    REFERENCES `kiurest`.`professor`(`professor_id`)
    ON DELETE RESTRICT ON UPDATE RESTRICT;
