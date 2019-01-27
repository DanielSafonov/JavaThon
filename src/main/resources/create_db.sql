create table if not exists javathon.javathon_schema."user" (
  id bigserial,
  first_name varchar,
  last_name VARCHAR,
  phone_number varchar,
  password VARCHAR,

  CONSTRAINT pk_users PRIMARY KEY (ID),
  UNIQUE (phone_number)
);

create table if not exists javathon.javathon_schema.hachaton (
  id BIGSERIAL,
  name VARCHAR,
  start_time TIMESTAMP,
  end_time TIMESTAMP,
  participants_limit INTEGER,
  host varchar,

  CONSTRAINT pk_hackatons_id PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS javathon.javathon_schema.TEAM (
  id BIGSERIAL,
  name VARCHAR,
  hackatone_id BIGINT,

  CONSTRAINT pk_teams_id PRIMARY KEY (ID),
  UNIQUE (NAME),
  constraint fk_teams_hackatone_id foreign key (hackatone_id) references javathon.javathon_schema.hachaton on update cascade on delete cascade
);
CREATE INDEX idx_teams_hackatone_id on javathon.javathon_schema.TEAM (hackatone_id);
create index idx_teams_name on javathon.javathon_schema.TEAM (name);

create table if not exists javathon.javathon_schema.PARTICIPANT(
  id bigserial,
  team_id BIGINT,
  user_id BIGINT,

  constraint pk_participants primary key (ID),
  CONSTRAINT fk_participants_team_id FOREIGN KEY (team_id) references javathon.javathon_schema.TEAM (id) on update cascade on delete cascade ,
  constraint fk_participants_user_id foreign key (user_id) references javathon.javathon_schema."user" (id) on update cascade on delete cascade
);
create index idx_participants_team_id on javathon.javathon_schema.PARTICIPANT (team_id);
create index idx_participants_user_id on javathon.javathon_schema.PARTICIPANT (user_id);

create table if not exists javathon_schema.history(
  id bigserial,
  key varchar,
  value varchar,

  constraint pk_audit_event_data primary key (id)
);
