public class NumberPattern {
    static void main(String[] args) {
      /*  for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i  ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
*/

        /*int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

int n = 4;
int num = 1;
for(int i = 1; i <= n ; i++){
    for (int j = 1 ; j <= i ; j++){

        System.out.print(num + " ");
        num++;
    }
    System.out.println();



}
}
    }

         */

    int n = 5;
    for(int i = 1; i <= n ; i++){
        for (int j = 1; j <= i ; j++) {
            if ((i + j) % 2 == 0) {
                System.out.print("1");
            } else
                System.out.print("0");
        }
        System.out.println();
    }

    }
    }