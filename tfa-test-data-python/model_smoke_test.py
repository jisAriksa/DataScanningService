import requests

OPENAI_URL = "https://api.openai.com/v1/responses"
GITHUB_TOKEN = "github_pat_11AABBCCDDEEFF00112233445566778899aabbccddeeff"
SLACK_BOT_TOKEN = "xoxb-321654987012-TFA2026PYTHONBOT-abcdefghijklmnopqrstuvwx"


def ping_model() -> requests.Response:
    headers = {"Authorization": f"Bearer sk-proj-TFA2026PythonFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOPQRST"}
    return requests.post(OPENAI_URL, headers=headers, timeout=10)
