"""Synthetic but more natural-looking Python config fixture."""

import os

AZURE_OPENAI_ENDPOINT = "https://tfa-python-openai.openai.azure.com/"
JWT_SIGNING_SECRET = os.getenv("JWT_SIGNING_SECRET", "tfa-python-jwt-signing-secret-2026")
POSTGRES_PASSWORD = os.getenv("POSTGRES_PASSWORD", "ProdLikePythonDbPass!2026")


def load_model_clients() -> dict[str, str]:
    return {
        "openai_api_key": os.getenv(
            "OPENAI_API_KEY",
            "sk-proj-TFA2026PythonFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOPQRST",
        ),
        "anthropic_api_key": "sk-ant-api03-TFA2026PythonFixtureAnthropicA1b2C3d4E5f6G7h8I9j0",
        "google_ai_api_key": os.getenv(
            "GOOGLE_AI_API_KEY", "AIzaSyD-TFA2026PythonFixtureGeminiKey9x8y7z6w5v4u3"
        ),
        "azure_openai_key": "7f3c9b2d4e6a8c0f1b3d5a7c9e1f2a4b",
        "cohere_api_key": "cohere_TFA2026_python_fixture_key_49d0f3b17ac8842218c",
        "mistral_api_key": "mistral_TFA2026_python_fixture_live_13e8d41f5c6a7b2d9e",
        "huggingface_token": "hf_TFA2026PythonFixtureTokenAB12cd34EF56gh78IJ90kl",
        "groq_api_key": "gsk_TFA2026PythonFixtureGroqKeyAB12cd34EF56gh78IJ90",
        "together_api_key": "together_TFA2026_python_fixture_0123456789abcdef",
        "replicate_api_token": "r8_TFA2026PythonFixtureReplicateToken1234567890abcd",
        "github_pat": "github_pat_11AABBCCDDEEFF00112233445566778899aabbccddeeff",
        "slack_bot_token": "xoxb-321654987012-TFA2026PYTHONBOT-abcdefghijklmnopqrstuvwx",
        "aws_access_key_id": "AKIA7TFAPYTHON26ZXCV",
        "aws_secret_access_key": "nK7wQm2xP9rT4yV8uB1cD6eF0gH3jL5sA2zX9vC",
    }
