int outPin = 3;
int currVol = 0;

void setup() {
  Serial.begin(9600);
  pinMode(outPin, OUTPUT);
}

void loop() {
  int volume = map(analogRead(A0), 0, 1023, 0, 100);
  if (currVol != volume) {
    currVol = volume;
    analogWrite(outPin, map(currVol, 0, 100, 0, 255));
    Serial.println(currVol);
  }
  /*
  if (Serial.available()) {
    long value = Serial.readString().toInt();
    analogWrite(outPin, value);
    Serial.println(value);
  }
  */
  delay(100);
}
