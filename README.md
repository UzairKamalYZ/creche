### Instantiate creche db ####
docker-compose UP

### Authenticate ####
Post: localhost:8090/creche/authenticate
Content-Type : application/json
Body: raw :
{
"username":"crecheAdmin",
"password":"password"
}

Response: JWT Token
### save Baby api ###
Post : localhost:8090/creche/baby
Header:
Content-Type : application/json
Authorization : Bearer JWT Token returned after authentication
