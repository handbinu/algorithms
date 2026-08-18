#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num_list[], size_t num_list_len) {
    int odd = 0, even = 0;
    for(int i = 0;i<num_list_len;i++){
        if(i% 2==0){
            odd += num_list[i];
        }else{
            even += num_list[i];
        }
    }
    return odd >= even?odd:even;
}