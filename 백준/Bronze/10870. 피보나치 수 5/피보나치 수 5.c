#include <stdio.h>
int main() {
	int n=0, r;
	scanf("%d", &n);
	int F(int a) {
		if(a>=2) {
			r=F(a-1)+F(a-2);
		}
		else if(a==1) {r=1;}
		else if(a==0) {r=0;}
		return r;
	}
	printf("%d", F(n));
}
