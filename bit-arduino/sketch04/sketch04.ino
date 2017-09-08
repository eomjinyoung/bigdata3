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
        if (cmd == "ctr=hw") {
            enableHW = true;
        Serial.println("success");
      
        } else if (cmd == "ctr=sw") {
            enableHW = false;
            Serial.println("success");
          
        } else if (cmd == "vol") {
            Serial.println(currVol);
            
        } else if (cmd.startsWith("vol=")) {
            if (!enableHW) {
                volume = cmd.substring(4).toInt();
                Serial.println("success");
            } else {
                Serial.println("fail");
            }
        } else {
            Serial.println("fail");
        }
    }

    if (enableHW) {
        volume = map(analogRead(A0), 0, 1023, 0, 100);
    }

    if (currVol != volume) {
        setVolume(volume);
    }
 
    delay(10);
}

void setVolume(int volume) {
    currVol = volume;
    analogWrite(outPin, map(currVol, 0, 100, 0, 255));
}





