void setVolume(int);

int outPin = 3;
int currVol = 0;
boolean enableHW = true;

void setup() {
  Serial.begin(9600);
  pinMode(outPin, OUTPUT);
}

void loop() {
  int volume = currVol;
  
  if (Serial.available()) {
    String cmd = Serial.readString();
    if (cmd == "ctr.hw") {
      enableHW = true;
      Serial.println("ctr.hw");
      
    } else if (cmd == "ctr.sw") {
      enableHW = false;
      Serial.println("ctr.sw");
      
    } else if (cmd.startsWith("vol.")) {
      if (!enableHW) {
        volume = cmd.substring(4).toInt();
      }
      Serial.print("vol.");
      Serial.println(cmd.substring(4));
      
    } else {
      Serial.println("error");
    }
  }

  if (enableHW) {
    volume = map(analogRead(A0), 0, 1023, 0, 100);
  }

  if (currVol != volume) {
    setVolume(volume);
  }
  /*
  if (Serial.available()) {
    long value = Serial.readString().toInt();
    analogWrite(outPin, value);
    Serial.println(value);
  }
  */
  delay(10);
}

void setVolume(int volume) {
  currVol = volume;
  analogWrite(outPin, map(currVol, 0, 100, 0, 255));
  Serial.println(currVol);
}





