FROM node:20.14.0 as build-stage
WORKDIR /app

RUN npm install -g @angular/cli
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build --prod

FROM nginx:alpine

RUN rm -rf /usr/share/nginx/html/*

COPY --from=build-stage /app/dist/ecommerce /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
