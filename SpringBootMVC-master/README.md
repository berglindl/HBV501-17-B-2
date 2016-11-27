Berglind had to use these SQL statements to get her database to work.

CREATE SEQUENCE notestable_id_seq;
ALTER TABLE public.notestable
ALTER COLUMN id SET DEFAULT nextval('notestable_id_seq'::regclass);

CREATE SEQUENCE grades_id_seq;
ALTER TABLE public.grades
ALTER COLUMN id SET DEFAULT nextval('grades_id_seq'::regclass);

For me(Fannar) and Pétur, I assume Hildur had no trouble either, the database was created as the program was ran but we dropped the database each time we tested.

To run the project (We used Eclipse) Import it as an Existing Maven Project, change the username and/or password to match your postgreSQL user
and run it as a Spring Boot application.