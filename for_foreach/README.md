# for와 foreach

갑자기 혼자 for와 foreach의 속도차이가 궁금해서 테스트 해봄

String을 chararray로 변환해 테스트 해볼때는 java와 kotlin에서 foreach가 더 빠름

int Array에서는 속도 차이가 거의 없음

다만 for와foreach와는 별개로  intarray와 arrayList차이는 일반 array가 훨씬 빠르다. 당연할거일수도 있지만 일단 체크!

ArrayList도 for와 foreach의 차이는 거의 없지만 for가 근소하게 더 빠른것으로 보임

다만 stream foreach가 제일 빠르긴함

당연하겠지만 루프돌릴때 아래와 같이 size를 계속 호출하는것 최대한 지양해야함 테스트 상태에 따라 4배 차이가 날때도 있었

for(int i = 0 ; i < arr.size() ; i++)

결론...글쎄...많은 공부와 경험으로 상황에 맞게 써야 할듯...  

코틀린 테스트결과 

|String을 chararray로 변환 일반 for문|time : 25|
|---|---| 
|String을 chararray로 변환 foreach|time : 1|
|int형 배열 인덱스 참조 for|time : 38 |
|int형 배열 foreach|time : 42| 
|ArrayList<Intger> for Size 계속호출|time : 238|
|ArrayList<Intger> for Size 미리구해서| time : 200|
|ArrayList<Intger>  foreach|time : 201|
|ArrayList<Intger>  foreach Stream|time : 162|

Java 테스트결과 

|String을 chararray로 변환 일반 for문|time : 22|
|---|---| 
|String을 chararray로 변환 foreach|time : 1|
|int형 배열 인덱스 참조 for|time : 25 |
|int형 배열 foreach|time : 24| 
|ArrayList<Intger> for Size 계속호출|time : 173|
|ArrayList<Intger> for Size 미리구해서| time : 173|
|ArrayList<Intger>  foreach|time : 181|
|ArrayList<Intger>  foreach Stream|time : 160|

코틀린과 자바의 차이는 있는것 처럼 보이나  intellij냐 이클립스냐 환경차이인것 같다.
자바를 intellij옮겨서 테스트 했을때는 차이가 거의 없었다 다음부터 이런 테스트는 같은 툴에서 해야겠다.