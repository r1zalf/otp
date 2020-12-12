# Api Spec

## Request Code OTP
Request :
- Method : GET
- Endpoint: `api/otp/${phone}`
- Header:
    - Accept: application/json
- Response :
```json
{
  "success": true,
  "message": "SMS code was sent",
  "phone": 622116162621
}
```

## Validation Code OTP
Request :
- Method : GET
- Endpoint: `api/otp/${phone}/${code}`
- Header:
    - Accept: application/json
- Response :
```json
{
  "success": true,
  "message": "Code is valid",
  "phone": 622116162621
}
```