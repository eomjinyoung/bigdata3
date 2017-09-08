int ledPin = 13;
int motionPin = 2;
int speakerPin = 3;
void setup() {
  Serial.begin(9600);
  pinMode(3, OUTPUT);
}

void loop() {
  int value = analogRead(A0);
  if (value > 100) {
      analogWrite(speakerPin, map(value, 0, 1023, 0, 255));
  } else {
      analogWrite(speakerPin, 0);
  }
  
  Serial.println(value);
  delay(100);
}
