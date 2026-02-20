#include "entities.h"
#include <stdlib.h>
#include <string.h>
#include <stdio.h>

Enemy *create_enemy(const char *name, int x, int y, int hitpoints) {
    Enemy *enemy = (Enemy *) malloc(sizeof(Enemy));
    if ( enemy == NULL ) {
        perror("Fehler bei malloc fuer Enemy");
        exit (EXIT_FAILURE);
    }
    enemy->name = strdup(name);
    enemy->x = x;
    enemy->y = y;
    enemy->hitpoints = hitpoints;
    enemy->status = ALIVE;
    return enemy;
}

void move_enemy(Enemy *enemy, int dx, int dy) {
    enemy->x += dx;
    enemy->y += dy;
}

void free_enemy( Enemy *enemy) {
    free(enemy->name);
    free(enemy);
}

Bullet *create_bullet(int x, int y) {
    Bullet *bullet = (Bullet *)malloc(sizeof(Bullet));
    if ( bullet == NULL ) {
        perror("Fehler bei malloc fuer Bullet");
        exit(EXIT_FAILURE);
    }
    bullet->x = x;
    bullet->y = y;
    bullet->active = false;
    return bullet;
}

void move_bullet(Bullet *bullet, int dx, int dy) {
    bullet->x += dx;
    bullet->y += dy;
}

void fire_bullet(Bullet *bullet) {
    bullet->active = true;
}