create table if not exists javathon.javathon_schema."user" (
  ID bigserial,
  FIRST_NAME varchar,
  LAST_NAME VARCHAR,
  PHONE_NUMBER varchar,
  PASSWORD VARCHAR,

  CONSTRAINT pk_users PRIMARY KEY (ID),
  UNIQUE (PHONE_NUMBER)
);

create table if not exists javathon.javathon_schema.HACKATON (
  ID BIGSERIAL,
  NAME VARCHAR,
  START_TIME TIMESTAMP,
  END_TIME TIMESTAMP,
  PARTICIPANTS_LIMIT INTEGER,

  CONSTRAINT pk_hackatons_id PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS javathon.javathon_schema.TEAM (
  ID BIGSERIAL,
  NAME VARCHAR,
  HACKATONE_ID BIGINT,

  CONSTRAINT pk_teams_id PRIMARY KEY (ID),
  UNIQUE (NAME),
  constraint fk_teams_hackatone_id foreign key (HACKATONE_ID) references javathon.javathon_schema.HACKATON
);
CREATE INDEX idx_teams_hackatone_id on javathon.javathon_schema.TEAM (HACKATONE_ID);
create index idx_teams_name on javathon.javathon_schema.TEAM (NAME);

create table if not exists javathon.javathon_schema.PARTICIPANT(
  ID bigserial,
  TEAM_ID BIGINT,
  USER_ID BIGINT,

  constraint pk_participants primary key (ID),
  CONSTRAINT fk_participants_team_id FOREIGN KEY (TEAM_ID) references javathon.javathon_schema.TEAM (ID),
  constraint fk_participants_user_id foreign key (USER_ID) references javathon.javathon_schema."user" (ID)
);
create index idx_participants_team_id on javathon.javathon_schema.PARTICIPANT (TEAM_ID);
create index idx_participants_user_id on javathon.javathon_schema.PARTICIPANT (USER_ID);