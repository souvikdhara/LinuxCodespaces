#include <stdio.h>
void change(int *a){
    *a+=5;
    printf("the value of b is %d",*a);
}

void main(){
int a =7;
change(&a);
printf("the value of a s %d",a);

}
