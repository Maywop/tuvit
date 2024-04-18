#include <stdio.h>
#include <stdlib.h>

int main() {
    char fixed_buf[30];
    snprintf(fixed_buf, sizeof(fixed_buf), "Very long format stringt\n");
    return 0;
}


/*
int main() {
    char *fixed_buff
    fixed_buf = malloc(20 * sizeof(char)); 
    if (fixed_buf == NULL) {
        fprintf(stderr, "Memory allocation failed\n");
        return 1;
    }
    snprintf(fixed_buf, 20, "Very long format stringt\n");
    free(fixed_buf); 
    return 0;
}
*/
