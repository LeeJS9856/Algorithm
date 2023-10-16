#include <stdio.h>
int main() {
	int a=0,n=1;
	scanf("%d", &a);
	int F(int i) {
		if(i>1) {
			n=F(i-1)*i;
			return n;
		}
		else {
			return n;
		}
	}
	
	printf("%d", F(a));
}