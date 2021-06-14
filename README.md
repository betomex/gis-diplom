# Дипломный проект геоинформационные системы

## Технологии

 - Golang, Kotlin, Java, JavaScript.
 - Gin-gonic, Spring(Spring-Security, Spring-Data, Spring-web), React, Leaflet.
 - Redis, Mongodb, Postgres.

> ![fear and loathing in diplomnaya rabota](./images/fear_and_loathing_in_diplomnaya_rabota.PNG)
> 
> У нас было 
> 2 дипломной работы, 
> 75 дней до нормоконтоля,
> 12 докер контейнеров,
> полсолонки shell скриптов и гора докер файлов,
> базданных и всего такого, всех цветов,
> а ещё литр Kotlin'а, литр JavaScript'a, ящик Golang'a, пол-литра HTML и две дюжины Css файлов.
>
> Не то, чтобы это всё было нужно при написании диплома, но раз начал коллекционировать технологии, то иди в своём увлечении до конца.

## Архитектура

![Link](./images/architecture.png)

Приложение состоит из следующих сервисов:
 - Управление аккаунтами пользователей осушествляется сервисом аунтефикации, написаном на Go с использованием Gin-gonic. Mongo используется для храниения данных пользователя. Redis - для refresh токенов.
 - ТСОДД сервис CRUD приложение для данных связанных с ТСОДД, написанов на Kotlin с использованием Spring. Postgres используется для хранения данных. Оптимальный план обслуживания ТСОДД составляется припомоши Optaplanner.
 - УДС сервис CRUD приложение для данных связанных с модернизацией УДС, написанов на Java с использованием Spring. Postgres используется для хранения данных. Оптимальный план модернизации УДС составляется припомоши Optaplanner.
 - фронт написан на React с Leaflet для отображения карты.

## Требования

- [Docker](https://www.docker.com/)
- Docker-compose

В случае windows лучше запускать из под wsl

## Запуск
```sh
docker-compose up
```

Приложение запускается на 8080 порте
