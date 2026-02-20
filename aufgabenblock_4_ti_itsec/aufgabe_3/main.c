#include "entities.h"
#include <stdio.h>
#include <stdlib.h>

int main () {
    Enemy *enemy = create_enemy("Alien", 10, 20, 3);
    printf("Enemy %s wurde erstellt. Startposition: (%d, %d), Hitponits: %d\n", 
        enemy->name, enemy->x, enemy->y, enemy->hitpoints);

    move_enemy(enemy, 5, -3);
    printf("Enemy %s neue Position: (%d, %d)\n", enemy->name, enemy->x, enemy->y);

    Bullet *bullet = create_bullet(enemy->x, enemy->y -1);
    fire_bullet(bullet);
    printf("Bullet abgefeuert. Position: (%d, %d), Aktiv %s\n", bullet->x, bullet->y, bullet->active ? "Ja" : "Nein");

    free_enemy(enemy);
    free(bullet);

    return 0;
}