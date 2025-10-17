//2022112471 이병현
#include <stdio.h>
#include <stdlib.h>

int main(){
    int N;
    printf("정수 개수 : ");
    scanf("%d",&N);
    int* arr = (int*)malloc(sizeof(int)*N);//동적할당
    printf("정수 %d개 입력 : ", N);
    for(int i=0;i<N;i++)//정수 배열에 저장
        scanf("%d",&arr[i]);
    
    int sum = 0;
    for(int i=0; i<N; i++)//합 계산
        sum+=arr[i];
    
    double avg = (double)sum/N;//평균 계산
    free(arr);//동적 메모리 해제

    printf("합 : %d | 평균 : %lf\n", sum, avg);
    return 0;    
}