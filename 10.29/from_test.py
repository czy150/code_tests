from flask import Flask
from flask import render_template
from flask import request


app = Flask(__name__)

@app.route("/he")
def index():
    name = request.args.get('name','Nobody')
    greet = request.args.get('greet','Hello')

    if name:
        greeting =f"{greet}, {name}"
    else:
        greeting = "Hello, world"

    return render_template("index.html", greeting=greeting)

if __name__ == "__main__":
    app.run()