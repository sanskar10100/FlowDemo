# Follow these steps before running the app:

1. Intall API depdencies
```
pip3 install fastapi
pip3 install uvicorn
```
2. Navigate to the api directory using `cd api`, and run the following:
```
uvicorn api:app
```
3. When the backend server starts responding on localhost:8000, run the following to forward your host machin's port 8000 to your Android device
```
adb reverse tcp:8000 tcp:8000
```
4. Upon obtaining `8000` as the reponse of the above command, start the app on the Android client.