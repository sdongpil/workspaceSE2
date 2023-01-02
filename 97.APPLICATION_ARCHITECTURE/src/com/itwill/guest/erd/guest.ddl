/**********************************/
/* Table Name: guest */
/**********************************/
CREATE TABLE guset(
		guset_no                      		NUMBER(10)		 NULL ,
		guset_name                    		VARCHAR2(50)		 NULL ,
		guset_date                    		DATE		 DEFAULT sysdate		 NULL ,
		guset_email                   		VARCHAR2(10)		 NULL ,
		guset_homepage                		VARCHAR2(50)		 NULL ,
		guset_title                   		VARCHAR2(100)		 NULL ,
		guset_content                 		VARCHAR2(2000)		 NULL 
);

CREATE SEQUENCE guset_guset_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER guset_guset_no_TRG
BEFORE INSERT ON guset
FOR EACH ROW
BEGIN
IF :NEW.guset_no IS NOT NULL THEN
  SELECT guset_guset_no_SEQ.NEXTVAL INTO :NEW.guset_no FROM DUAL;
END IF;
END;

COMMENT ON TABLE guset is 'guest';
COMMENT ON COLUMN guset.guset_no is 'guset_no';
COMMENT ON COLUMN guset.guset_name is 'guset_name';
COMMENT ON COLUMN guset.guset_date is 'guset_date';
COMMENT ON COLUMN guset.guset_email is 'guset_email';
COMMENT ON COLUMN guset.guset_homepage is 'guset_homepage';
COMMENT ON COLUMN guset.guset_title is 'guset_title';
COMMENT ON COLUMN guset.guset_content is 'guset_content';



ALTER TABLE guset ADD CONSTRAINT IDX_guset_PK PRIMARY KEY (guset_no);

