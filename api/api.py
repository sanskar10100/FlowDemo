# A simple python API that 
# increments a counter and returns its value in reponse

from fastapi import FastAPI
app = FastAPI()

count = 0

@app.get("/latest")
async def fetchLatest():
    global count
    count += 1
    return {"message": f'Call Count: {count}'}