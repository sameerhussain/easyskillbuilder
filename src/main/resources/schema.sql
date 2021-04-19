DROP TABLE IF EXISTS trains;

CREATE TABLE trains (
    "id" INT8 NOT NULL,
    "name" VARCHAR(255),
    "description" VARCHAR(1023),
    "distance_between_stop" VARCHAR(31),
    "max_speed" VARCHAR(31),
    "sharing_tracks" BOOLEAN,
    "grade_crossing" BOOLEAN,
    "train_frequency" VARCHAR(255),
    "amenities" VARCHAR(2047)
);