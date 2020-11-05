Como criar app
https://spring.io/guides/gs/spring-boot/#initial

Install 
https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/reference/htmlsingle/#getting-started-installing-the-cli

OSX Homebrew Installation
$ brew tap pivotal/tap
$ brew install springboot

Rodar app 
$ DATABASE_URL='mysql://localhost:3306/itaumon?useTimezone=true&serverTimezone=UTC' USER='root' PASSWORD='' ./mvnw spring-boot:run