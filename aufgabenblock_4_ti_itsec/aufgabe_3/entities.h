#ifndef ENTITIES_H
#define ENTITIES_H

#include <stdbool.h>

typedef enum {
    ALIVE,
    DEAD
} Status;

typedef struct {
    char *name;
    int x;
    int y;
    int hitpoints;
    Status status;
} Starship;

typedef struct {
    char *name;
    int x;
    int y;
    int hitpoints;
    Status status;
} Enemy;

typedef struct {
    int x;
    int y;
    bool active;
} Bullet;

Enemy *create_enemy(const char *name, int x, int y, int hitpoints);
void move_enemy(Enemy *enemy, int dx, int dy);
void free_enemy(Enemy *enemy);

Bullet *create_bullet(int x, int y);
void move_bullet(Bullet *bullet, int dx, int dy);
void fire_bullet(Bullet *bullet);

#endif