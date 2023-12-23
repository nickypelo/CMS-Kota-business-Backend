FROM ubuntu:latest
LABEL authors="nicodemus"

ENTRYPOINT ["top", "-b"]