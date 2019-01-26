create table if not exists javathon.javathon_schema.USERS (
  ID bigserial,
  FIRST_NAME varchar,
  LAST_NAME VARCHAR,
  PHONE_NUMBER varchar,
  PASSWORD VARCHAR,

  CONSTRAINT pk_users PRIMARY KEY (ID),
  CONSTRAINT UNIQUE (PHONE_NUMBER)
);

create table if not exists javathon.javathon_schema.PARTICIPANTS(
  TEAM_ID BIGINT,
  USER_ID BIGINT,

  CONSTRAINT fk_participants_team_id FOREIGN KEY (TEAM_ID) references javathon.javathon_schema.TEAMS (TEAM_ID),
  constraint fk_participants_user_id foreign key (USER_ID) references javathon.javathon_schema.USERS (USER_ID)
);
create index idx_participants_team_id on javathon.javathon_schema.PARTICIPANTS (TEAM_ID);
create index idx_participants_user_id on javathon.javathon_schema.PARTICIPANTS (USER_ID);

create table if not exists javathon.javathon_schema.HACKATONS(
  ID BIGSERIAL,
  NAME VARCHAR,
  START_TIME TIMESTAMP,
  END_TIME TIMESTAMP,
  PARTICIPANTS_LIMIT INTEGER,

  CONSTRAINT pk_hackatons_id PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS javathon.javathon_schema.TEAMS (
  ID BIGSERIAL,
  NAME VARCHAR,
  HACKATONE_ID BIGINT,

  CONSTRAINT pk_teams_id PRIMARY KEY (ID),
  CONSTRAINT UNIQUE (NAME),
  constraint fk_teams_hackatone_id foreign key (HACKATONE_ID) references javathon.javathon_schema.HACKATONS
);
CREATE INDEX idx_teams_hackatone_id on javathon.javathon_schema.TEAMS (HACKATONE_ID);
create index idx_teams_name on javathon.javathon_schema.TEAMS (NAME);