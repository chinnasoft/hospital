CREATE TABLE patient (
  id SERIAL  NOT NULL ,
  social_number VARCHAR(50)   NOT NULL ,
  first_name VARCHAR(50)   NOT NULL ,
  last_name VARCHAR(50)   NOT NULL ,
  birth_dt TIMESTAMP   NOT NULL   ,
PRIMARY KEY(id)  );


CREATE UNIQUE INDEX patient_UNIQ_sn ON patient (social_number);




-- ------------------------------------------------------------
-- value of field prof is in num object.
-- ------------------------------------------------------------

CREATE TABLE personal (
  id SERIAL  NOT NULL ,
  first_name VARCHAR(50)   NOT NULL ,
  second_name VARCHAR(50)   NOT NULL ,
  tab_number INTEGER   NOT NULL ,
  pass VARCHAR(50)   NOT NULL ,
  prof INTEGER   NOT NULL ,
  acess_lvl INTEGER   NOT NULL ,
  del_marker BOOL   NOT NULL   ,
PRIMARY KEY(id)  );


CREATE UNIQUE INDEX personal_UNIQ_tab_number ON personal (tab_number);




-- ------------------------------------------------------------
-- con_lvl_type value:
-- 1-for lvl smoller
-- 2-for lvl bigger
-- 3-only for lvl
-- ------------------------------------------------------------

CREATE TABLE conferense (
  id SERIAL  NOT NULL ,
  con_date_time TIMESTAMP   NOT NULL ,
  day_order TEXT   NOT NULL ,
  con_lvl INTEGER   NOT NULL ,
  con_visit INTEGER    ,
  con_lvl_type INTEGER   NOT NULL   ,
PRIMARY KEY(id));

CREATE UNIQUE INDEX conferense_UNIQ_con_date_time ON conferense (con_date_time);


-- ------------------------------------------------------------
-- important_flag  --  prime dactor control
-- discharge_flag --  0 - curing ; 1- ask to discharge; 2 -- discharged
-- ------------------------------------------------------------

CREATE TABLE visit (
  id SERIAL  NOT NULL ,
  patient_id INTEGER   NOT NULL ,
  start_dt TIMESTAMP   NOT NULL ,
  end_dt TIMESTAMP    ,
  first_ds TEXT    ,
  last_ds TEXT   NOT NULL ,
  carent_ward INTEGER    ,
  important_flag INTEGER   NOT NULL ,
  discharge_flag INTEGER   NOT NULL   ,
PRIMARY KEY(id)  ,
  FOREIGN KEY(patient_id) REFERENCES patient(id));


CREATE INDEX visit_FK2_patient_id ON visit (patient_id);

CREATE TABLE conferense_2_personal (
  personal_id INTEGER   NOT NULL ,
  conferense_id INTEGER   NOT NULL     ,
  FOREIGN KEY(conferense_id)
    REFERENCES conferense(id),
  FOREIGN KEY(personal_id)
    REFERENCES personal(id));


CREATE INDEX conferense_2_personal_FKIndex1 ON conferense_2_personal (conferense_id);
CREATE INDEX conferense_2_personal_FKIndex2 ON conferense_2_personal (personal_id);


CREATE TABLE conference_2_visit (
  visit_id INTEGER   NOT NULL ,
  conferense_id INTEGER   NOT NULL     ,
  FOREIGN KEY(conferense_id)
    REFERENCES conferense(id),
  FOREIGN KEY(visit_id)
    REFERENCES visit(id));


CREATE INDEX conference_2_visit_FKIndex1 ON conference_2_visit (conferense_id);
CREATE INDEX conference_2_visit_FKIndex2 ON conference_2_visit (visit_id);



CREATE TABLE checkup (
  id SERIAL  NOT NULL ,
  personal_id INTEGER   NOT NULL ,
  visit_id INTEGER   NOT NULL ,
  ch_dt TIMESTAMP   NOT NULL ,
  interview TEXT   NOT NULL ,
  diagnosis VARCHAR(250)      ,
PRIMARY KEY(id)    ,
  FOREIGN KEY(visit_id)
    REFERENCES visit(id),
  FOREIGN KEY(personal_id)
    REFERENCES personal(id));


CREATE INDEX checkup_FKIndex1 ON checkup (visit_id);
CREATE INDEX checkup_FKIndex2 ON checkup (personal_id);


CREATE TABLE prescribe (
  id SERIAL  NOT NULL ,
  checkup_id INTEGER   NOT NULL ,
  coment TEXT    ,
  res_value TEXT    ,
  res_dt TIMESTAMP    ,
  res_personal_id INTEGER   NOT NULL   ,
PRIMARY KEY(id)    ,
  FOREIGN KEY(checkup_id)
    REFERENCES checkup(id),
  FOREIGN KEY(res_personal_id)
    REFERENCES personal(id));


CREATE INDEX prescribe_FK2_ch_id ON prescribe (checkup_id);
CREATE INDEX prescribe_FK2_personal_id ON prescribe (res_personal_id);



CREATE TABLE result_sourse (
  id SERIAL  NOT NULL ,
  prescribe_id INTEGER   NOT NULL ,
  sourse_link VARCHAR(255)      ,
PRIMARY KEY(id)  ,
  FOREIGN KEY(prescribe_id)
    REFERENCES prescribe(id));


CREATE INDEX result_sourse_FK2_prescribe_id ON result_sourse (prescribe_id);


